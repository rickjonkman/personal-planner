package dev.rick.personalplanner.budget.income;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.rick.personalplanner.Frequency;
import dev.rick.personalplanner.Month;
import dev.rick.personalplanner.budget.income.enums.BudgetTypeFrequent;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
public class IncomeFrequent {

    @Id
    @GeneratedValue
    private long id;

    @NotEmpty
    @NotNull
    @Enumerated(EnumType.STRING)
    private BudgetTypeFrequent type;

    @NotEmpty
    private String name;

    @NotNull
    private double amount;

    @NotEmpty
    @NotNull
    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    @NotNull
    @NotEmpty
    private Month startMonth;

    @Enumerated(EnumType.STRING)
    @NotNull
    @NotEmpty
    private Month endMonth;

    // TODO: Add user
}
