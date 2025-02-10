import java.util.function.Predicate;

public class CombiningPredicates {
    Predicate<String> hasLeftBrace = str -> str.startsWith("{");
    Predicate<String> hasRightBrace = str -> str.endsWith("}");

    // Combining predicates

    // boolean and
    Predicate<String> hasBraces = hasLeftBrace.and(hasRightBrace);

    // boolean or
    Predicate<String> hasBracesOrNot = hasLeftBrace.or(hasRightBrace);

    // negate
    Predicate<String> hasBracesOrNotNot = hasBracesOrNot.negate();
}
