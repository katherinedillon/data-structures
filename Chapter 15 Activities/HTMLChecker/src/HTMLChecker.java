import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample1.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            Stack<String> theStack = new Stack<String>();
            
            while (in.hasNext()){
                String value = in.next();
                System.out.println("Tag: " + value);

                if (isOpeningTag(value))
                {
                    theStack.push(getTagName(value));
                }
                else if (isClosingTag(value))
                {
                    if (theStack.isEmpty())
                    {
                        System.out.println("Closing tag with no matching opening tag");
                        return;
                    }

                    String expected = theStack.pop();
                    String actual = getTagName(value);

                    if (!expected.equals(actual))
                    {
                        System.out.println("Error");
                        return;
                    }
                }
                else
                {
                    System.out.println("Invalid: " + value);
                }
            }

            if (theStack.isEmpty())
            {
                System.out.println("Success!");
            }
            else
            {
                System.out.println("There are unmatched open tags" + theStack);
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    private static boolean isOpeningTag(String tag)
    {
        return tag.startsWith("<") && !tag.startsWith("</") && tag.endsWith(">");
    }

    // Helper to check if it's a closing tag
    private static boolean isClosingTag(String tag)
    {
        return tag.startsWith("</") && tag.endsWith(">");
    }

    // Extracts tag name without angle brackets and slash
    private static String getTagName(String tag)
    {
        return tag.replaceAll("[</>]", "");
    }
}

