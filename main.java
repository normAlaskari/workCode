import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws Exception {

        int TRANX_NO = 1362;
        int PROPOSAL = 1003;
        int ID = 2856;
        String ORDER_TYPE ="ADMINISTRATIVE" , CATEGORY ="TRAINING" ,PROACTIVE_YN = "E" , CRAFT_CODE = "TRAINING TIME";
        String CRAFT_CAT= "ADMINISTRATIVE", PRI_CODE = "ROUTINE", REGION_CODE= "NM" , FAC_ID = "SAF";
        String BLDG = "SAFB01" , SHOP = "MOBILE SHOP-2" , DEFAULT_DIST = "S" , TRANX_DATE = "2/1/19 0:03";
        String TRANX_TYPE = "PO_INV_CHARGE";
        int FISCAL_YEAR = 2019;
        double AMOUNT = 374.85;
        String SUBLEDGER_TYPE = "M";

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter how many rows you want to add");
        long MULTITENANT_ID = myObj.nextLong();

        FileOutputStream fos = new FileOutputStream("IQ_OM_COSTS_"+MULTITENANT_ID+"_rows"+".csv",true);
        FileOutputStream fos2 = new FileOutputStream("IQ_OM_COSTS_PROPERTIES_"+MULTITENANT_ID+"_rows"+".csv",true);

        PrintWriter pw = new PrintWriter(fos);
        PrintWriter pw2 = new PrintWriter(fos2);
            pw.println("MULTITENANT_ID , TRANX_NO, PROPOSAL , SORT_CODE , ORDER_TYPE , CATEGORY ," +
                       " PROACTIVE_YN , PROBLEM_CODE , CRAFT_CODE , CRAFT_CAT , PRI_CODE , WO_PRI_CODE , OC_CODE , REQUESTOR , " +
                       "REQUEST_METHOD , ASSET_GROUP , ASSET_TAG ,  ROUTE_NO , TEMPLATE_ID ,  INSPECTION_NO , FAILURE_CODE , " +
                       "REGION_CODE , FAC_ID ,   BLDG ,  LOCATION_CODE , LOC_TYPE , USAGE_CODE , SHOP , DEFAULT_DIST , " +
                       "TRANX_DATE , TRANX_TYPE , FISCAL_YEAR , AMOUNT , SUBLEDGER_TYPE , COMPANY_ID , DEPT_ID , LOC_ID ");

        for(long i =1; i < MULTITENANT_ID+2 ; i++){
            pw.println( i  + "," + (TRANX_NO+i) + "," +(PROPOSAL+i) + "," + i + ","+ ORDER_TYPE +","+ CATEGORY +","
                    +PROACTIVE_YN + "," + "NULL" + "," + CRAFT_CODE + "," + CRAFT_CAT + "," + PRI_CODE + "," + "NULL"
                    + "," + "NULL" + "," + "NULL" + "," + "NULL"+ "," + "NULL"+ "," + "NULL"+ "," + "NULL"+ "," + "NULL"+ "," + "NULL"
                    + "," + "NULL" + "," + REGION_CODE + "," + FAC_ID + "," +BLDG + "," + "NULL"+ "," + "NULL"+ "," + "NULL"+ "," + SHOP
                    + "," + DEFAULT_DIST + "," + TRANX_DATE + "," + TRANX_TYPE + "," + FISCAL_YEAR + "," + AMOUNT + "," + SUBLEDGER_TYPE
                    + "," + "NULL" + ","  + "NULL" +  "," + "NULL");
        }

        pw2.println( "MULTITENANT_ID , ZONE_TYPE , ZONE_CODE , PORTFOLIO_ID, REGION_CODE , FAC_ID , BLDG , PROP_TYPE , BLDG_CLASS , USER_GROSS ," +
                "USER_RENTABLE , USER_USEABLE , USER_ASSIGNABLE , USER_NONASSIGNABLE_SQFT , GROSS_SQFT , RENTABLE_SQFT , USABLE_SQFT ," +
                " ASSIGNABLE_SQFT , NONASSIGNABLE_SQFT , LOCATION_GROSS_SQFT , CIRCULATION_SQFT , OCCUPIED_SQFT , BASELNE_USG_SQFT " +
                " , BASELINE_COST_SQFT , BENCH_USG_SQFT , BENCH_COST_SQFT");
        for(long i =1; i < MULTITENANT_ID+2 ; i++){
        	pw2.println( (ID+i) + "," + "-" + "," + "-" + "," + "-" + "," + "AZ" + "," + "PHX" + "," +"LOAD-PROP" + "," + "" + "," + ""
                    + "," + 0 + "," + 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","
                    + 0 + ","+ 0 + ","+ 0 + ","+ 0 + ","+ 0 );
        }
        pw.close();
        pw2.close();
        System.out.println("File was succsufuly made");
    }

}
