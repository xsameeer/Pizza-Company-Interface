package Projects.Project6;

/*************
 *Program name: Pizza
 *Program Description: This program keeps a track of the pizzas purchased by patrons for the company Pizza Experience.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 04/22/2023
 *CMSC 255 901
 ***************/
public class Pizza {

    // data members
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private MeatTopping meatTopping;
    private VeggieTopping veggieTopping;

    /***
     * Default constructor
     */
    public Pizza() {
        size = Size.SMALL;
        crust = Crust.HAND_TOSSED;
        sauce = Sauce.MARINARA;
        meatTopping = MeatTopping.none;
        veggieTopping = VeggieTopping.none;
    }

    /***
     * Constructor with parameters
     *
     * @param aSize
     * @param aCrust
     * @param aSauce
     * @param aMeatTopping
     * @param aVeggieTopping
     */
    public Pizza(Size aSize, Crust aCrust, Sauce aSauce, MeatTopping aMeatTopping, VeggieTopping aVeggieTopping) {
        this.size = aSize;
        this.crust = aCrust;
        this.sauce = aSauce;
        this.meatTopping = aMeatTopping;
        this.veggieTopping = aVeggieTopping;
    }

    /***
     * Set size
     *
     * @param size
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /***
     * Set crust
     *
     * @param crust
     */
    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    /***
     * Set sauce
     *
     * @param sauce
     */
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    /***
     * Set meat topping
     *
     * @param meatTopping
     */
    public void setMeatTopping(MeatTopping meatTopping) {
        this.meatTopping = meatTopping;
    }

    /***
     * Set veggie topping
     *
     * @param veggieTopping
     */
    public void setVeggieTopping(VeggieTopping veggieTopping) {
        this.veggieTopping = veggieTopping;
    }

    /***
     * Get size
     *
     * @return size
     */
    public Size getSize() {
        return size;
    }

    /***
     * Get crust
     *
     * @return crust
     */
    public Crust getCrust() {
        return crust;
    }

    /***
     * Get sauce
     *
     * @return sauce
     */
    public Sauce getSauce() {
        return sauce;
    }

    /***
     * Get meat topping
     *
     * @return meatTopping
     */
    public MeatTopping getMeatTopping() {
        return meatTopping;
    }

    /***
     * Get veggie topping
     *
     * @return veggieTopping
     */
    public VeggieTopping getVeggieTopping() {
        return veggieTopping;
    }

    /***
     * print pizza description
     *
     * @return string representation of pizza description
     */
    @Override
    public String toString() {
        String output = "\n";
        output += "\t" + this.size + "\n";
        output += "\t" + this.crust + "\n";
        output += "\t" + this.sauce + "\n";
        output += "\t" + this.meatTopping + "\n";
        output += "\t" + this.veggieTopping + "\n";
        return output;
    }
}
