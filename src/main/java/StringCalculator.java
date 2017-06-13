
public class StringCalculator {

    int add(String numbers){
        if (numbers == "") {
            return 0;
        }
        String sanitizedString = numbers.replace("\n",",");
        int result = 0;
        String[] arrayOfNumbers = sanitizedString.split(",");
        for (String number: arrayOfNumbers) {
            Integer intNumber;
            intNumber = Integer.valueOf(number);
            result +=intNumber;
        }
        return result;
    }
}
