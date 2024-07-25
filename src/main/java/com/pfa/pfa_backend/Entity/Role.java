package com.pfa.pfa_backend.Entity;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.Enumerated;


public enum Role {
    Citoyen,
    Responsable_General,
    Responsable_Service
}
