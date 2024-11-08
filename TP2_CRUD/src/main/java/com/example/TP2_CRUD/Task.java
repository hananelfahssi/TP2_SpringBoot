package com.example.TP2_CRUD;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "La description ne peut pas être vide")
    @Size(max = 255, message = "La description ne doit pas dépasser 255 caractères")
    private String description;

    @NotNull(message = "La date de création est obligatoire")
    private Date creationDate;

    @NotNull(message = "La date d'échéance est obligatoire")
    private Date dueDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "La description ne peut pas être vide") @Size(max = 255, message = "La description ne doit pas dépasser 255 caractères") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "La description ne peut pas être vide") @Size(max = 255, message = "La description ne doit pas dépasser 255 caractères") String description) {
        this.description = description;
    }

    public @NotNull(message = "La date de création est obligatoire") Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(@NotNull(message = "La date de création est obligatoire") Date creationDate) {
        this.creationDate = creationDate;
    }

    public @NotNull(message = "La date d'échéance est obligatoire") Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(@NotNull(message = "La date d'échéance est obligatoire") Date dueDate) {
        this.dueDate = dueDate;
    }
}
