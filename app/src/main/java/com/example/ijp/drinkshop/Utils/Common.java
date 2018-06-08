package com.example.ijp.drinkshop.Utils;

import com.example.ijp.drinkshop.Model.Category;
import com.example.ijp.drinkshop.Model.Drink;
import com.example.ijp.drinkshop.Model.User;
import com.example.ijp.drinkshop.Retrofit.IDrinkShopAPI;
import com.example.ijp.drinkshop.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public class Common {

    private static final String BASE_URL="http://10.0.2.2/drinkshop/";

    public static final String toppingMenuId="7";

    public static User currentUser=null;

    public static Category currentCategory=null;

    public static List<Drink> toppingList=new ArrayList<>();

    public static double toppingPrice=0.0;
    public static List<String> toppingAdded=new ArrayList<>();

    // Hold Field
    public static int sizeOfCup=-1;// -1: number choose (error) ,0:M,1:L
    public static int sugar=-1;// -1 : No choose(Error)
    public static int ice=-1;

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
