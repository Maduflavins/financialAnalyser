package com.company.flavins;

import java.nio.file.NoSuchFileException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class OverlySpecificBankStatementValidator {
    private String description;
    private String date;
    private String amount;

    public OverlySpecificBankStatementValidator(final String description, final String date, final String amount){
        this.description = Objects.requireNonNull(description);
        this.date = Objects.requireNonNull(description);
        this.amount = Objects.requireNonNull(description);
    }

    public Notification validate(){
        final Notification notification = new Notification();
        if(this.description.length() > 1000){
            notification.addError("The description is too long");
        }
        final LocalDate parsedDate;
        try{
            parsedDate = LocalDate.parse(this.date);
            if(parsedDate.isAfter(LocalDate.now())) {
                notification.addError("date cannot be in he future");
            }
        }catch (DateTimeParseException e){
            notification.addError("Invalid format for date");
        }
        final double amount;
        try{
            amount = Double.parseDouble(this.amount);
        }catch (NumberFormatException e){
            notification.addError("Invalid format for amount");
        }
        return notification;
    }


}
