package com.nettyim.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Designates that a return value, argument, could not be null.
 *
 * This annotation act as an api documentation only.
 *
 * For an argument, the invoker should check the nullness first.  The method will assume that this
 *  argument is not null, thus may or may not handle with this nullness.
 * For a return value, the method itself guarantee not to return a nullable result.
 */
@Target({
        ElementType.METHOD,
        ElementType.PARAMETER,
})
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface NeverNull {
}

