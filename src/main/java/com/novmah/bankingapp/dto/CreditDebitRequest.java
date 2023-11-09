package com.novmah.bankingapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditDebitRequest {

    @NotNull(message = "Account number cannot be null")
    @NotEmpty(message = "Account number cannot be empty")
    @Pattern(regexp = "^[0-9]+$", message = "Account number must contain only numeric characters")
    private String accountNumber;

    @NotNull(message = "Amount cannot be null")
    @PositiveOrZero(message = "Amount must be positive or zero")
    private BigDecimal amount;
}
