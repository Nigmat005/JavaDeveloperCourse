package com.cydeo.enums;

import lombok.*;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("Male"),FEMALE("Female");
    private @NonNull String genderType;

}
