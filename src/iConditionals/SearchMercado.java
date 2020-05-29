package iConditionals;

public class SearchMercado {

    public static void main(String[] args) {

        String url = "https://www.mercadolibre.com.mx/";
        String browsertitle;

        navigate();
        boolean verif = verifyHomepage();

        if (verif == true) {
            searchProduct();
        } else {
            navigate();
        }

        validateSearchresults();
    }


    public static void navigate() {
        //try {
        //
        //     Desktop.getDesktop().browse(new direccción web)
        open browser;
        Enter mercado libre URL;

    }

    private static boolean verifyHomepage() {
        browsertitle = gettitle();
        boolean flag = false;

        If url.contains(browsertitle) {
            System.out.println("Correct page");
            flag = true;

        }

            else{
            System.out.println("Incorrect page");
        }
        return flag;
    }


    private static void searchProduct() {
        //Enter the search criteria and click enter
    }

    private static void validateSearchresults() {
        //if (results match with the search criteria)
        // Search = success

        //else if (message= "No hay publicaciones que coincidan con tu búsqueda")
        //Search = failed

    }
}

