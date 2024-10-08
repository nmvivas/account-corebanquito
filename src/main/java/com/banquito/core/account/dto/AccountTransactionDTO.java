package com.banquito.core.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountTransactionDTO {
    private Integer accountId;
    private String codeChannel;
    private BigDecimal amount;
    private String debitorAccount;
    private String creditorAccount;
    private String transactionType;
    private String reference;
    private BigDecimal comission;
    private String parentTransactionKey;

    //RESPONSE
    private LocalDateTime createDate;
    private String status;
    private BigDecimal pendiente;
}
