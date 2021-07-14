package someshbose.github.io.springsecurity.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface WithCustomUser {

    String username();
}
