package util;

import comparators.*;
import enums.StudentComparatorType;
import enums.UniversityComparatorType;

public class ComparatorUtil {

    private ComparatorUtil() {
    }

    public static StudentComparator getStudentComparator(StudentComparatorType studentComparatorType) {

        switch (studentComparatorType) {

            case UNIVERSITITY_ID:
                return new StudentUniversityIdComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case COURSE_NUMBER:
                return new StudentCourseComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType universityComparatorType) {

        switch (universityComparatorType) {

            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case PROFILE:
                return new UniversityProfileComparator();
            case YEAR:
                return new UniversityYearComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
