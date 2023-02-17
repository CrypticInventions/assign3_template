//File: SimpleLinkedListTest.java. 
//Add a file header comment or a class header comment to your work.

package assign3_template;

/**
 * Assign 3 Template.
 * Testing different methods (successful and failed calls)
 * 
 */
public class SimpleLinkedListTest {

    public static void main(String[] args) {
        
        //2.2 Revise SimpleLinkedListTest
        //create an empty singly linked list of int values
        //append some integers
        //For method size, use one test case.
        //test all other methods using at least 2 calls:
        //  successful call, e.g. call indexOf(..) and pass an existing integer
        //  failed call, e.g. call indexOf(..) and pass a non-existing integer
   
        //You can reuse some of the code below given to you in the lectures.        
        
        //create an empty list
        SimpleLinkedList numbers = new SimpleLinkedList();
        
        //append 3 integers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        //numbers.add(1,2);
        //numbers.add(0,2)
        System.out.println(numbers);

        numbers.add(3,1); //valid test
        //numbers.add(5,101); //invalid test
        System.out.println("new list: " + numbers);
        // numbers.removeByValue(1);
        //dump the contents in the list in the original order
        System.out.println(numbers.get(2)); //valid test
        numbers.get(10); // invalid test
        numbers.removeByValue(1); //valid test
        //numbers.removeByValue(22); //invalid test
        System.out.println(numbers.indexOf(22));
        //or use:
        //System.out.println(numbers.toString());        
    }   
    
}
