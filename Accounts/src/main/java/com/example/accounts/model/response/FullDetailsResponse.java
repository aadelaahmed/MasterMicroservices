package com.example.accounts.model.response;

import lombok.Builder;

@Builder
public record FullDetailsResponse(
        String cardsDetails,
        String loansDetails
) {
}
