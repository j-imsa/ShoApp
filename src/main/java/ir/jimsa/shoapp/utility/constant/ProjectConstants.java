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

    // ======================== SHOP ======================== //
    public static final String SHOP_DOCUMENT_NAME = "Product endpoint";
    public static final String SHOP_DOCUMENT_DESCRIPTION = "Rest APIs Shop details";
    public static final String SHOP_PATH = "/" + APP_VERSION + "/shop";


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
    public static final String SHOP_GET_PATH = "/{" + GENERAL_PUBLIC_ID_FIELD + "}";
    public static final String SHOP_DELETE_PATH = "/{" + GENERAL_PUBLIC_ID_FIELD + "}";
    public static final String SHOP_POST_PATH = "/{" + GENERAL_PUBLIC_ID_FIELD + "}";


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

    // ======================== Exception ======================== //
    public static final String GENERAL_EXCEPTION_NULL = "null";
    public static final String GENERAL_EXCEPTION_NULL_MESSAGE = "Unfortunately, initialization failed, and the Null object was detected! Please report this status to the developers' team.";
    public static final String GENERAL_EXCEPTION_LOG_PATTERN = "{} : {}";
    public static final String GENERAL_EXCEPTION_REGEX = "%s %s";
    public static final String GENERAL_EXCEPTION_MESSAGE = "message";
    public static final String GENERAL_EXCEPTION_PATH = "path";

    public static final String EXCEPTION_DATE_MESSAGE = "This day has been initialized before!";
    public static final String EXCEPTION_START_END_FORMAT_MESSAGE = "The start time should be less than the end time";
    public static final String EXCEPTION_NOT_FOUND_RESOURCE_MESSAGE = "The resource with provided public_id not founded!";
    public static final String EXCEPTION_NOT_FOUND_RESOURCE_BY_PHONE_NUMBER_MESSAGE = "The resource with provided phone_number not founded!";
    public static final String EXCEPTION_NOT_ACCEPTABLE_RESOURCE_MESSAGE = "The resource with provided public_id founded with a relation, so you can not remove it!";
    public static final String EXCEPTION_RESOURCE_ALREADY_EXIST_MESSAGE = "The appointment has already been reserved!";
    public static final String EXCEPTION_RESOURCE_ALREADY_DELETED_MESSAGE = "The appointment has already been deleted!";

    public static final String EXCEPTION_METHOD_METHOD_ARGUMENT_NOT_VALID = "MethodArgumentNotValid";
    public static final String EXCEPTION_METHOD_HTTP_MESSAGE_NOT_READABLE = "HttpMessageNotReadable";
    public static final String EXCEPTION_METHOD_APP_SERVICE_EXCEPTION = "AppServiceExceptions";
    public static final String EXCEPTION_METHOD_OPTIMISTIC_LOCK_EXCEPTION = "OptimisticLockException";
    public static final String EXCEPTION_METHOD_CONSTRAINT_VIOLATION_EXCEPTION = "ConstraintViolationExceptions";
    public static final String EXCEPTION_METHOD_APP_500_EXCEPTION = "App500Exceptions";

    // ======================== API Definition ======================== //
    public static final String API_DOCUMENT_INFO_TITLE = "ShoApp";
    public static final String API_DOCUMENT_INFO_DESCRIPTION = "Microservice REST API documentation";
    public static final String API_DOCUMENT_INFO_VERSION = APP_VERSION;
    public static final String API_DOCUMENT_INFO_CONTACT_NAME = "Iman Salehi";
    public static final String API_DOCUMENT_INFO_CONTACT_URL = "https://www.linkedin.com/in/jimsa/";
    public static final String API_DOCUMENT_INFO_CONTACT_EMAIL = "cse.isalehi@gmail.com";
    public static final String API_DOCUMENT_INFO_LICENSE_NAME = "Apache 2.0";
    public static final String API_DOCUMENT_INFO_LICENSE_URL = "https://www.apache.org/licenses/LICENSE-2.0";
    public static final String API_DOCUMENT_EXTERNAL_DOCS_DESCRIPTION = "Source code repository";
    public static final String API_DOCUMENT_EXTERNAL_DOCS_URL = "https://github.com/j-imsa/shoapp";
    public static final String API_DOCUMENT_SERVERS_1_DESCRIPTION = "Dev, local";
    public static final String API_DOCUMENT_SERVERS_1_URL = "http://localhost:8088/";
    public static final String API_DOCUMENT_SERVERS_2_DESCRIPTION = "Dev, Server";
    public static final String API_DOCUMENT_SERVERS_2_URL = "http://152.11.42.185:8090/";

    // ======================== Document ======================== //
    public static final String GENERAL_DOCUMENT_PAGE_EXAMPLE = "3";
    public static final String GENERAL_DOCUMENT_SIZE_EXAMPLE = "25";

    public static final String SHOP_DOCUMENT_POST_SUMMERY = "Doctor: Create appointments";
    public static final String SHOP_DOCUMENT_POST_DESCRIPTION = "Create some new appointments using POST method and getting request body";
    public static final String SHOP_DOCUMENT_GET_SUMMERY = "Doctor/Patient: Read all appointments with different types";
    public static final String SHOP_DOCUMENT_GET_DESCRIPTION = "Read all appointments using GET method, by type";
    public static final String SHOP_DOCUMENT_DELETE_SUMMERY = "Doctor: Delete an appointment";
    public static final String SHOP_DOCUMENT_DELETE_DESCRIPTION = "Delete an appointment using DELETE method and getting a valid public_id as a parameter";


    // ======================== API Documents ======================== //
    public static final String API_DOCUMENT_DEFAULT_SUMMERY = "Default summary";
    public static final String API_DOCUMENT_DEFAULT_DESCRIPTION = "Default description";

    public static final String API_DOCUMENT_RESPONSE_CODE_200 = "200";
    public static final String API_DOCUMENT_RESPONSE_CODE_201 = "201";
    public static final String API_DOCUMENT_RESPONSE_CODE_400 = "400";
    public static final String API_DOCUMENT_RESPONSE_CODE_404 = "404";
    public static final String API_DOCUMENT_RESPONSE_CODE_406 = "406";
    public static final String API_DOCUMENT_RESPONSE_CODE_409 = "409";
    public static final String API_DOCUMENT_RESPONSE_CODE_500 = "500";

    public static final String API_DOCUMENT_400_DESCRIPTION = "Due to invalid inputs, it responded as a bad request";
    public static final String API_DOCUMENT_404_DESCRIPTION = "Due to invalid public_id, it responded a not-found";
    public static final String API_DOCUMENT_406_DESCRIPTION = "This appointment has a related patient, so it can not be removed";
    public static final String API_DOCUMENT_409_DESCRIPTION = "This appointment has been reserved before";
    public static final String API_DOCUMENT_500_DESCRIPTION = "Internal server error has occurred";

    public static final String API_DOCUMENT_PUBLIC_ID_DESCRIPTION = "The public_id of the resource";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE = "a7vqO-mCBzlJpgGjSU-HYsTpLblN4El-UEmr8M9LMIm01dqmNIqENiE0RiLIfu9e";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE_1_NAME = "Valid example";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE_1_VALUE = "a7vqO-mCBzlJpgGjSU-HYsTpLblN4El-UEmr8M9LMIm01dqmNIqENiE0RiLIfu9e";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE_1_SUMMERY = "Example public ID 1, Valid";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE_2_NAME = "Invalid example";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE_2_VALUE = "xyz789xyz789xyz789x@%&*";
    public static final String API_DOCUMENT_PUBLIC_ID_EXAMPLE_2_SUMMERY = "Example public ID 2, Invalid";

    // @CreateAppointmentRequestDocument
    public static final String API_DOCUMENT_SHOP_POST_201_DESCRIPTION = "Creating products with the provided info was successful";
    public static final String API_DOCUMENT_SHOP_POST_201_EXAMPLE = """
            {
                "action": true,
                "timestamp": "15/09/2024 09:54:59 AM",
                "result": {
                        "name": "jafar",
                        "public_id": "9sL0JIT4om-J230FyV-hq6JPfbstKIpTFzpqmpsBYM9yvSEBLzd62F5nV9LEOlaF"
                    }
            }
            """;
    public static final String API_DOCUMENT_SHOP_POST_400_EXAMPLE = """
            {
              "action": false,
              "timestamp": "10/09/2024 10:01:13 PM",
              "result": {
                "publicId": "public_id must be null on the creation operation",
                "start-end": "The start time must BE before the end time! It means this formula must be true: 'abs(end-start) > 1s' and be sure that 'The start can not be 23:59:59 (MAX) and the end can not be 00:00:00 (MIN)'"
              }
            }
            """;
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_DESCRIPTION = "This request comes with a date, start and end time";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_1_NAME = "A valid request with a valid body #1";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_1_SUMMERY = "Valid example #1";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_1_VALUE = """
            {
              "name": "jafar"
            }
            """;
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_2_NAME = "An invalid request without a valid body #1";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_2_SUMMERY = "Invalid example #1";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_2_VALUE = """
            {
              "name": "     "
            }
            """;
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_3_NAME = "An invalid request without a valid body #2";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_3_SUMMERY = "Invalid example #2";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_3_VALUE = """
            {
              "name": ":)"
            }
            """;
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_4_NAME = "An invalid request without a valid body #3";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_4_SUMMERY = "Invalid example #3";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_4_VALUE = """
            {
              "name": "jafar",
              "public_id": "9sL0JIT4om-J230FyV-hq6JPfbstKIpTFzpqmpsBYM9yvSEBLzd62F5nV9LEOlaF"
            }
            """;
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_5_NAME = "An invalid request without a valid body #4";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_5_SUMMERY = "Invalid example #4";
    public static final String API_DOCUMENT_SHOP_POST_REQUEST_BODY_EXAMPLE_5_VALUE = """
            {
              "name": "@#$"
            }
            """;
    public static final String API_DOCUMENT_500_EXAMPLE = """
            {
              "action": false,
              "timestamp": "10/09/2024 10:20:30 PM",
              "result": {
                "path": "{METHOD} /{VERSION}/{PATH-PID-...}",
                "message": "Internal service error!"
              }
            }
            """;
    
}
