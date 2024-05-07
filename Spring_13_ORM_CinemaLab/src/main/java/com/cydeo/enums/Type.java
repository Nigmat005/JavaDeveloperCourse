package com.cydeo.enums;

import lombok.*;

@Getter(AccessLevel.PUBLIC)
@RequiredArgsConstructor
public enum Type {
PREMIER("Premier"),REGULAR("Regular") ;
   @NonNull private String type;

}
