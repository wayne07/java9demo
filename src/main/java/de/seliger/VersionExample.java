package de.seliger;

public class VersionExample {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("version.toString: " + version.toString());
        System.out.println("major: " + version.major());
        System.out.println("minor: " + version.minor());
        System.out.println("security: " + version.security());
        version.build().ifPresentOrElse(
                (s) -> System.out.println("build: " + s),
                () -> System.out.println("no build info")
        );
        version.optional().ifPresentOrElse(
                (s) -> System.out.println("optional: " + s),
                () -> System.out.println("no optional info")
        );
        version.pre().ifPresentOrElse(
                (s) -> System.out.println("pre: " + s),
                () -> System.out.println("no pre info")
        );
    }

}
