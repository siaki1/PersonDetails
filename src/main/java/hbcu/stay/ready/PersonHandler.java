package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        while (counter < personArray.length) {
            result += personArray[counter].toString();
            counter++;

        }


        return result;
    }
    // while `counter` is less than length of array
    // begin loop

    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable

    // end loop


    public String forLoop() {
        String result = "";

        for (int counter = 0; counter < personArray.length; counter++) {
            result += personArray[counter].toString();
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public String forEachLoop() {
        String result = "";
        for (Person each : personArray) {
            result += each.toString();
        }
            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }
    }

