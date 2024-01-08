package Projects.Project6;

/*************
 *Program name: Patron
 *Program Description: This program creates an identity for the Patron to be represented by in the system and helps
 * the Pizza Experience keep track of it along with the type of Pizza they purchased.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 04/21/2023
 *CMSC 255 901
 ***************/

import java.util.ArrayList;

public class Patron {

    // data members
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<Pizza> pizzas;

    /***
     * Default constructor
     */
    public Patron() {
        this.firstName = "";
        this.lastName = "";
        this.phone = "";
        this.email = "";
        this.pizzas = new ArrayList<Pizza>();
    }


    public Patron(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.pizzas = new ArrayList<Pizza>();
    }

    /***
     * Set first name
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /***
     * Set last name
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /***
     * Set phone
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /***
     * Set email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /***
     * Get first name
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /***
     * Get last name
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /***
     * Get phone
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /***
     * Get email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /***
     * Add pizza
     *
     * @param pizza
     */
    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    /***
     * Get number of pizzas
     *
     * @return numPizzas
     */
    public int getNumPizzas() {
        return this.pizzas.size();
    }

    /***
     * Get pizzas
     *
     * @return pizzas
     */
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    /***
     * toString method
     *
     * @return string representation of Patron object
     */
    @Override
    public String toString() {
        // create output string
        String output = "";
        // add patron information and new line character
        output += this.firstName + "\n";
        output += this.lastName + "\n";
        output += this.phone + "\n";
        output += this.email + "\n";
        output += "Pizzas:\n";

        // loop through pizzas and add to output string
        for (int i = 0; i < this.pizzas.size(); i++) {
            output += this.pizzas.get(i).toString();
        }

        // return output string
        return output;
    }
}
