package ir.jimsa.shoapp.utility.constant;

public class ProjectConstants {

    private ProjectConstants() {
    }

    // ======================== Application ======================== //
    public static final String APP_VERSION = "v0.9";

    // ======================== PRODUCT ======================== //
    public static final String PRODUCT_DATABASE_TABLE_NAME = "products";
    public static final String PRODUCT_DATABASE_JOIN_ID = "product_id";

    // ======================== UTILITY ======================== //
    public static final String ANONYMOUS_USER = "AnonymousUser";

    public static final long LOG_DEFAULT_TIMEOUT = 15;
    public static final String LOG_PATTERN = "Executed {} in {} ms";

    public static final String PUBLIC_ID_PATTERN = "^[A-Za-z0-9-_]+$";
    public static final String PUBLIC_ID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
    public static final String PUBLIC_ID_DESCRIPTION = "The public_id of the resource";
    public static final String PUBLIC_ID_EXAMPLE_1 = "a7vqO-mCBzlJpgGjSU-HYsTpLblN4El-UEmr8M9LMIm01dqmNIqENiE0RiLIfu9e";
    public static final String PUBLIC_ID_EXAMPLE_2 = "a7vqO-mCBzlJpgGjSU-HYsTpLblN4El-UEmr8M9LMIm01dqmNIqENiE0RiLIfu9y";
    public static final int PUBLIC_ID_MIN_LENGTH = 32;
    public static final int PUBLIC_ID_MAX_LENGTH = 512;
    public static final int PUBLIC_ID_DEFAULT_LENGTH = 64;

    public static final String LOGGER_TOTAL_ELEMENTS = "Total Elements: {}";
    public static final String LOGGER_TOTAL_PAGES = "Total Pages: {}";
    public static final String LOGGER_NUMBER_OF_ELEMENTS = "Number of Elements: {}";
    public static final String LOGGER_SIZE = "Size: {}";

    // ======================== Validation ======================== //
    public static final String GENERAL_STATUS_ALL = "ALL";
    public static final String GENERAL_STATUS_OPEN = "OPEN";
    public static final String GENERAL_STATUS_TAKEN = "TAKEN";
    public static final String GENERAL_STATUS_DELETED = "DELETED";
    public static final String GENERAL_VALIDATION_STATUS_PATTERN = "open|taken|deleted|all";
    public static final String GENERAL_VALIDATION_STATUS_FIELD_PATTERN_MESSAGE = "status field must be 'open', 'taken', 'deleted', or 'all'";
    public static final String GENERAL_VALIDATION_PAGE_POSITIVE_INTEGER = "page must be a positive number";
    public static final String GENERAL_VALIDATION_SIZE_POSITIVE_INTEGER = "size must be a positive number";
    public static final String GENERAL_VALIDATION_DATE_MESSAGE = "date must NOT be null/blank/empty";
    public static final String GENERAL_VALIDATION_PUBLIC_ID_DEFAULT_MESSAGE = "Invalid public_id";
    public static final String GENERAL_VALIDATION_TIME_SEQUENCE_DEFAULT_MESSAGE = "The time sequence isn't valid!";
    public static final String GENERAL_VALIDATION_SORT_DIRECTION_PATTERN = "asc|desc";
    public static final String GENERAL_VALIDATION_SORT_DIRECTION_PATTERN_MESSAGE = "sort direction must be 'asc' or 'desc'";

}
