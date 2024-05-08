package dev.rick.personalplanner.budget.income;

import dev.rick.personalplanner.budget.income.enums.BudgetTypeVariable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IncomeVariable {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @NotEmpty
    @Enumerated(EnumType.STRING)
    private BudgetTypeVariable type;

    @NotNull
    @NotEmpty
    private double amount;

    private LocalDate transferDate;

    // TODO: Add User
}
