public class ComponentFactory {
    public static final String APILE = "aPile";
    public static final String SURBATTERIE = "surBatterie";
    public static final String BRANCHEMENTSECTEUR = "branchementSecteur";
    public static final String BRANCHEMENTUSB = "branchementUSB";
    public static final String RECHARGEINDUCTION = "rechargeInduction";

    public static Component createComponent (String type) {
        Component component = null;

        switch(type) {
            case APILE:
                component = new APile(component) {
                break;
            case SURBATTERIE:
                component = new SurBatterie();
                break;
            case BRANCHEMENTSECTEUR:
                component = new BranchementSecteur();
                break;
            case BRANCHEMENTUSB:
                component = new BranchementUSB();
                break;
            case RECHARGEINDUCTION:
                component = new RechargeInduction();
                break;
            default:
                throw new IllegalArgumentException("Type d'appareil ou de pièce inconnu!");
        }
        return component;
    }
}
