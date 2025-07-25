package com.estagio.ec2.aws.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MessageBuild {
    @NotNull(message = "message não pode ser nulo. ")
    @Size(min = 2, max = 12, message = "O tamanho da mensagem deve conter de 2 a 12 caracteres. ")
    String message;
}
