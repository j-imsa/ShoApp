package ir.jimsa.shoapp.utility.constant;

public class ProjectConstants {

    private ProjectConstants() {
    }

    // ======================== Application ======================== //
    public static final String APP_VERSION = "v0.9";

    // ======================== PRODUCT ======================== //
    public static final String PRODUCT_DATABASE_TABLE_NAME = "products";
    public static final String PRODUCT_DATABASE_JOIN_ID = "product_id";
    public static final String PRODUCT_DTO_DOCUMENT_NAME = "Appointment";
    public static final String PRODUCT_DTO_DOCUMENT_DESCRIPTION = "This is 'AppointmentDto'";


    // ======================== General ======================== //
    public static final long GENERAL_DURATION = 30L;
    public static final String GENERAL_STRING_TYPE = "string";
    public static final String GENERAL_STATUS_FIELD = "status";
    public static final String GENERAL_DATE_FIELD = "date";
    public static final String GENERAL_SORT_FIELD = "sort_field";
    public static final String GENERAL_PUBLIC_ID_FIELD = "public_id";
    public static final String GENERAL_SORT_DIRECTION_ASC_FIELD = "asc";
    public static final String GENERAL_SORT_DIRECTION_DESC_FIELD = "desc";
    public static final String GENERAL_PAGE_DEFAULT_VALUE = "1";
    public static final String GENERAL_SIZE_DEFAULT_VALUE = "10";
    public static final String GENERAL_SORT_FIELD_DEFAULT_VALUE = "time";
    public static final String GENERAL_SORT_DIRECTION = "sort_direction";
    public static final String DOCTOR_GET_PATH = "/{" + GENERAL_DATE_FIELD + "}";
    public static final String DOCTOR_DELETE_PATH = "/{" + GENERAL_PUBLIC_ID_FIELD + "}";
    public static final String PATIENT_POST_PATH = "/{" + GENERAL_PUBLIC_ID_FIELD + "}";


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

    public static final String PRODUCT_VALIDATION_PUBLIC_ID_NULL_MESSAGE = "public_id must BE null on the creation operation";

    // ======================== Response ======================== //
    public static final String RESPONSE_DOCUMENT_NAME = "App Response";
    public static final String RESPONSE_DOCUMENT_DESCRIPTION = "This is 'ResponseDto'";
    public static final String RESPONSE_DOCUMENT_ACTION_DESCRIPTION = "What is the final result? It will be true if the process is finished without any faults, otherwise, it is false.";
    public static final String RESPONSE_DOCUMENT_ACTION_EXAMPLE = "true";
    public static final String RESPONSE_DOCUMENT_TIMESTAMP = "The time of response";
    public static final String RESPONSE_DATE_TIME_FORMAT_EXAMPLE = "16/09/2024 23:11:14 PM";
    public static final String RESPONSE_DOCUMENT_RESULT = "The result of the response, including boolean, object, list, and so on";

    // ======================== DATE TIME ======================== //
    public static final String DATE_FORMAT = "dd-MM-yyyy";
    public static final String DATE_FORMAT_EXAMPLE = "16-09-2024";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String TIME_FORMAT_EXAMPLE = "18:14:05";
    public static final String DATE_TIME_FORMAT = "dd/MM/yyyy hh:mm:ss a";

}
