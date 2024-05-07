package com.cydeo.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter(AccessLevel.PUBLIC)
@RequiredArgsConstructor
public enum State {
    ACTIVE("Active"),DRAFT("Draft"),SUSPENDED("Suspended");
    private @NonNull String state;

}
