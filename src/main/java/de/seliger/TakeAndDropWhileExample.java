package de.seliger;

import java.util.stream.Stream;

public class TakeAndDropWhileExample {

    public static void main(String[] args) {
        Stream.of("<html>", "<head>", "<title>foo</title>", "</head>", "<body>", "<h1>you Foo</h1>", "<p>on the world</p>", "</body>", "</html>")
                .dropWhile(s -> !"<body>".equals(s))
                .skip(1)
                .takeWhile(s -> !"</body>".equals(s))
                .forEach(System.out::println);
    }

}
