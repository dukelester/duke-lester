

/*
* Check out the following project for a hotel.
*
* */


package com.company;

import java.util.Scanner;

public class Main {
/*
* @Duke lester
* */
    public static void main(String[] args) {
	// write your code here
System.out.println("\t\t\t\t\t\t\t\t ******************************");
System.out.println("****************GREETINGS DEAR CUSTOMER!!!***************");
System.out.println("\t\t\t\t\t\t\t\t WELCOME TO LESTER HOTEL");
System.out.println("*****************SELF  SERVICE MENU************** ");
System.out.println("\t\t\t\t\t\t\t\t ******************************");
System.out.println("\n");
System.out.println("\t\t \t **HERE IS OUR HOTEL MENU **\n \tFEEL FREE TO PLACE YOUR ORDER");
System.out.print("\t\t\t\t**********\n\t\t\t\t********\n\t\t\t\t******\n\t\t\t\t***\n\t\t\t\t**\n");
        System.out.print("\t\t\t\t*\n\t\t\t\t****\n\t\t\t\t******\n\t\t\t\t*******\n\t\t\t\t**********");
System.out.println("\n\n");

System.out.println("1. Chapati");
System.out.println("2. Tea ");
System.out.println("3. Mandazi");
System.out.println("4. Roasted Chicken");
System.out.println("5. Half roasted Chicken");
System.out.println("6. Chicken Piece");
System.out.println("7. Vegetable with Salad");
System.out.println("8. Ugali fish");
System.out.println("9. Beef");
System.out.println("10. Rice Beef");
System.out.println("11. Rice Chicken");
System.out.println("12. Pilau");
System.out.println("13. Chips");
System.out.println("14. Pulses");
System.out.println("15. Matoke ");

System.out.println("********************************\n");
System.out.println("We also offer the following Drinks\n");
System.out.println("*********************************\n");
System.out.println("16. Soda");
System.out.println("17. Mineral Water");
System.out.println("18. Fresh Milk");
System.out.println("19. Warm Water");
System.out.println(("20. Energy Drink"));


System.out.println("\n\n");

        Scanner input = new Scanner(System.in);
        int choice;  //The option of the customer.

        System.out.println("Please select what we may serve you today.\n");
        choice = input.nextInt();
        switch (choice) {   //using the switch to accept the selection for the customer.
            case 1:
            {
              // Scanner input = new Scanner(System.in);
               int choice1;
               int Chapati_price = 50;
               System.out.println("You selected Chapati. Please pay KSH. " + Chapati_price +"  For it");
               choice1 = input.nextInt();

               if (choice1 < Chapati_price) {
                   System.out.println("You chose " + choice1);
                   System.out.println("Please enter the amount KSH." + Chapati_price);
               }
               else if (choice1 > Chapati_price){
                   choice1 = choice1 - Chapati_price;
                   System.out.println("Please take your change of  KSH." + choice1);
                   System.out.println("\nWelcome back again.");
                   System.out.println("\n Thanks for choosing Lester Hotel");
               }
               else if (choice1 == Chapati_price){
                   System.out.println("You have payed fully for your Chapati");
                   System.out.println("Thanks for choosing Lester Hotel");
                   System.out.println("Welcome back again.");

               }
                break;
            }
            case 2:
            {
                // Scanner input = new Scanner(System.in);
                int choice2;
                int Tea_price = 50;
                System.out.println("You selected Tea. Please pay KSH. " + Tea_price +" For it");
                choice2 = input.nextInt();

                if (choice2 < Tea_price) {
                    System.out.println("You chose " + choice2);
                    System.out.println("Please enter the amount KSH." + Tea_price);
                }
                else if (choice2 > Tea_price){
                    choice2 = choice2 - Tea_price;
                    System.out.print("Please take your change of  KSH." + choice2);
                    System.out.println("\n Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");
                }
                else if (choice2 == Tea_price){
                    System.out.println("You have payed fully for your Tea");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 3:
            {
                // Scanner input = new Scanner(System.in);
                int choice3;
                int Mandazi_price = 25;
                System.out.println("You selected Mandazi. Please pay KSH. " + Mandazi_price +"  For it");
                choice3 = input.nextInt();

                if (choice3 < Mandazi_price) {
                    System.out.println("You chose " + choice3);
                    System.out.println("Please enter the amount KSH." + Mandazi_price);
                }
                else if (choice3 > Mandazi_price){
                    choice3 = choice3 - Mandazi_price;
                    System.out.println("Please take your change of  KSH." + choice3);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice3 == Mandazi_price){
                    System.out.println("You have payed fully for your Mandazi");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 4:
            {
                // Scanner input = new Scanner(System.in);
                int choice4;
                int RoastedChicken_price = 950;
                System.out.println("You selected Full Roasted Chicken. Please pay KSH. " + RoastedChicken_price +"  For it");
                choice4 = input.nextInt();

                if (choice4 < RoastedChicken_price) {
                    System.out.println("You chose " + choice4);
                    System.out.println("Please enter the amount KSH." + RoastedChicken_price);
                }
                else if (choice4 > RoastedChicken_price){
                    choice4 = choice4 - RoastedChicken_price;
                    System.out.println("Please take your change of  KSH." + RoastedChicken_price);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice4 == RoastedChicken_price) {
                    System.out.println("You have payed fully for your Roasted Chicken");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 5:
            {
                // Scanner input = new Scanner(System.in);
                int choice5;
                int HalfRoastedChicken_price = 500;
                System.out.println("You selected Half Roasted Chicken. Please pay KSH. " + HalfRoastedChicken_price +"  For it");
                choice5 = input.nextInt();

                if (choice5 < HalfRoastedChicken_price ) {
                    System.out.println("You chose " + choice5);
                    System.out.println("Please enter the amount KSH." + HalfRoastedChicken_price );
                }
                else if (choice5 > HalfRoastedChicken_price ){
                    choice5 = choice5 - HalfRoastedChicken_price ;
                    System.out.println("Please take your change of  KSH." + choice5);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice5 == HalfRoastedChicken_price ){
                    System.out.println("You have payed fully for your Half Roasted Chicken ");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 6:
            {
                // Scanner input = new Scanner(System.in);
                int choice6;
                int ChickenPiece_price = 350;
                System.out.println("You selected Chicken Piece. Please pay KSH. " + ChickenPiece_price +"  For it");
                choice6 = input.nextInt();

                if (choice6 < ChickenPiece_price) {
                    System.out.println("You chose " + choice6);
                    System.out.println("Please enter the amount KSH." + ChickenPiece_price);
                }
                else if (choice6 > ChickenPiece_price){
                    choice6 = choice6 - ChickenPiece_price;
                    System.out.println("Please take your change of  KSH." + choice6);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice6 == ChickenPiece_price){
                    System.out.println("You have payed fully for your Chicken Piece");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 7:
            {
                // Scanner input = new Scanner(System.in);
                int choice7;
                int VegetableWithSalad_price = 150;
                System.out.println("You selected Vegetables with Salad. Please pay KSH. " + VegetableWithSalad_price +"  For it");
                choice7 = input.nextInt();

                if (choice7 < VegetableWithSalad_price) {
                    System.out.println("You chose " + choice7);
                    System.out.println("Please enter the amount KSH." + VegetableWithSalad_price);
                }
                else if (choice7 > VegetableWithSalad_price){
                    choice7 = choice7 - VegetableWithSalad_price;
                    System.out.println("Please take your change of  KSH." + choice7);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice7 == VegetableWithSalad_price){
                    System.out.println("You have payed fully for your Vegetables with Salad");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 8:
            {
                // Scanner input = new Scanner(System.in);
                int choice8;
                int UgaliFish_price = 450;
                System.out.println("You selected Ugali with Fish. Please pay KSH. " +  UgaliFish_price+"  For it");
                choice8 = input.nextInt();

                if (choice8 < UgaliFish_price) {
                    System.out.println("You chose " + choice8);
                    System.out.println("Please enter the amount KSH." +  UgaliFish_price);
                }
                else if (choice8 >  UgaliFish_price){
                    choice8 = choice8 - UgaliFish_price;
                    System.out.println("Please take your change of  KSH." + choice8);
                    System.out.println("\n Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");
                }
                else if (choice8 ==  UgaliFish_price){
                    System.out.println("You have payed fully for your Ugali with Fish");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 9:
            {
                // Scanner input = new Scanner(System.in);
                int choice9;
                int Beef_price = 300;
                System.out.println("You selected Beef. Please pay KSH. " + Beef_price +"  For it");
                choice9 = input.nextInt();

                if (choice9 <Beef_price) {
                    System.out.println("You chose " + choice9);
                    System.out.println("Please enter the amount KSH." + Beef_price);
                }
                else if (choice9 > Beef_price){
                    choice9 = choice9 - Beef_price;
                    System.out.println("Please take your change of  KSH." + choice9);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice9 == Beef_price){
                    System.out.println("You have payed fully for your Beef");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 10:
            {
                // Scanner input = new Scanner(System.in);
                int choice10;
                int RiceBeef_price = 350;
                System.out.println("You selected Rice Beef. Please pay KSH. " + RiceBeef_price  +"  For it");
                choice10 = input.nextInt();

                if (choice10 < RiceBeef_price ) {
                    System.out.println("You chose " + choice10);
                    System.out.println("Please enter the amount KSH." + RiceBeef_price );
                }
                else if (choice10 >RiceBeef_price ){
                    choice10 = choice10 - RiceBeef_price ;
                    System.out.println("Please take your change of  KSH." + choice10);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice10== RiceBeef_price ){
                    System.out.println("You have payed fully for your Rice Beef");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 11:
            {
                // Scanner input = new Scanner(System.in);
                int choice11;
                int RiceChicken_price = 650;
                System.out.println("You selected Rice Chicken. Please pay KSH. " + RiceChicken_price +"  For it");
                choice11 = input.nextInt();

                if (choice11 < RiceChicken_price) {
                    System.out.println("You chose " + choice11);
                    System.out.println("Please enter the amount KSH." + RiceChicken_price);
                }
                else if (choice11 > RiceChicken_price){
                    choice11 = choice11 - RiceChicken_price;
                    System.out.println("Please take your change of  KSH." + choice11);
                    System.out.println("\n Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");
                }
                else if (choice11 == RiceChicken_price){
                    System.out.println("You have payed fully for your Rice Chicken");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 12:
            {
                // Scanner input = new Scanner(System.in);
                int choice12;
                int Pilau_price = 250;
                System.out.println("You selected Pilau. Please pay KSH. " + Pilau_price +"  For it");
                choice12 = input.nextInt();

                if (choice12 < Pilau_price) {
                    System.out.println("You chose " + choice12);
                    System.out.println("Please enter the amount KSH." + Pilau_price);
                }
                else if (choice12 > Pilau_price){
                    choice12 = choice12 - Pilau_price;
                    System.out.println("Please take your change of  KSH." + choice12);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice12 == Pilau_price){
                    System.out.println("You have payed fully for your Pilau");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 13:
            {
                // Scanner input = new Scanner(System.in);
                int choice13;
                int Chips_price = 150;
                System.out.println("You selected Chips. Please pay KSH. " + Chips_price +"  For it");
                choice13 = input.nextInt();

                if (choice13 < Chips_price) {
                    System.out.println("You chose " + choice13);
                    System.out.println("Please enter the amount KSH." + Chips_price);
                }
                else if (choice13 >Chips_price){
                    choice13 = choice13 - Chips_price;
                    System.out.println("Please take your change of  KSH." + choice13);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice13 == Chips_price){
                    System.out.println("You have payed fully for your Chips");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 14:
            {
                // Scanner input = new Scanner(System.in);
                int choice14;
                int Pulses_price = 400;
                System.out.println("You selected Pulses. Please pay KSH. " + Pulses_price +"  For it");
                choice14 = input.nextInt();

                if (choice14 < Pulses_price) {
                    System.out.println("You chose " + choice14);
                    System.out.println("Please enter the amount KSH." + Pulses_price);
                }
                else if (choice14 > Pulses_price){
                    choice14 = choice14 - Pulses_price;
                    System.out.println("Please take your change of  KSH." + choice14);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice14 == Pulses_price){
                    System.out.println("You have payed fully for your Pulses");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 15:
            {
                // Scanner input = new Scanner(System.in);
                int choice15;
                int Matoke_price = 200;
                System.out.println("You selected Matoke. Please pay KSH. " + Matoke_price +"  For it");
                choice15 = input.nextInt();

                if (choice15 < Matoke_price) {
                    System.out.println("You chose " + choice15);
                    System.out.println("Please enter the amount KSH." + Matoke_price);
                }
                else if (choice15 > Matoke_price){
                    choice15 = choice15 - Matoke_price;
                    System.out.println("Please take your change of  KSH." + choice15);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice15 == Matoke_price){
                    System.out.println("You have payed fully for your Matoke");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 16:
            {
                // Scanner input = new Scanner(System.in);
                int choice16;
                int Soda_price = 100;
                System.out.println("You selected 500 ML Soda. Please pay KSH. " + Soda_price +"  For it");
                choice16 = input.nextInt();

                if (choice16 < Soda_price) {
                    System.out.println("You chose " + choice16);
                    System.out.println("Please enter the amount KSH." + Soda_price);
                }
                else if (choice16 > Soda_price){
                    choice16 = choice16 - Soda_price;
                    System.out.println("Please take your change of  KSH." + choice16);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice16 == Soda_price){
                    System.out.println("You have payed fully for your 500 ML Soda");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 17:
            {
                // Scanner input = new Scanner(System.in);
                int choice17;
                int MineralWater_price = 70;
                System.out.println("You selected 500 ML Mineral water. Please pay KSH. " + MineralWater_price +"  For it");
                choice17 = input.nextInt();

                if (choice17 < MineralWater_price ) {
                    System.out.println("You chose " + choice17);
                    System.out.println("Please enter the amount KSH." + MineralWater_price );
                }
                else if (choice17 > MineralWater_price ){
                    choice17 = choice17 - MineralWater_price ;
                    System.out.println("Please take your change of  KSH." + choice17);
                    System.out.println("\n Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");
                }
                else if (choice17 == MineralWater_price ){
                    System.out.println("You have payed fully for your 500 ML Mineral water");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 18:
            {
                // Scanner input = new Scanner(System.in);
                int choice18;
                int FreshMilk_price = 70;
                System.out.println("You selected 500 ML Fresh Milk. Please pay KSH. " + FreshMilk_price +"  For it");
                choice18 = input.nextInt();

                if (choice18 < FreshMilk_price) {
                    System.out.println("You chose " + choice18);
                    System.out.println("Please enter the amount KSH." + FreshMilk_price);
                }
                else if (choice18 > FreshMilk_price){
                    choice18 = choice18 - FreshMilk_price;
                    System.out.println("Please take your change of  KSH." + choice18);
                    System.out.println("\n Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");
                }
                else if (choice18 == FreshMilk_price){
                    System.out.println("You have payed fully for your 500 ML Fresh Milk");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 19:
            {
                // Scanner input = new Scanner(System.in);
                int choice19;
                int WarmWater_price = 50;
                System.out.println("You selected Warm Water. Please pay KSH. " +WarmWater_price +"  For it");
                choice19 = input.nextInt();

                if (choice19 < WarmWater_price) {
                    System.out.println("You chose " + choice19);
                    System.out.println("Please enter the amount KSH." + WarmWater_price);
                }
                else if (choice19 > WarmWater_price){
                    choice19 = choice19 - WarmWater_price;
                    System.out.println("Please take your change of  KSH." + choice19);
                    System.out.println("\n Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");
                }
                else if (choice19 == WarmWater_price){
                    System.out.println("You have payed fully for your Warm Water");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            case 20:
            {
                // Scanner input = new Scanner(System.in);
                int choice20;
                int EnergyDrink_price = 150;
                System.out.println("You selected Energy Drink. Please pay KSH. " + EnergyDrink_price +"  For it");
                choice20 = input.nextInt();

                if (choice20 < EnergyDrink_price) {
                    System.out.println("You chose " + choice20);
                    System.out.println("Please enter the amount KSH." + EnergyDrink_price);
                }
                else if (choice20 > EnergyDrink_price){
                    choice20 = choice20 - EnergyDrink_price;
                    System.out.println("Please take your change of  KSH." + choice20);
                    System.out.println("Welcome back again.");
                    System.out.println("\n Thanks for choosing Lester Hotel");
                }
                else if (choice20 == EnergyDrink_price){
                    System.out.println("You have payed fully for your Energy Drink");
                    System.out.println("Thanks for choosing Lester Hotel");
                    System.out.println("Welcome back again.");

                }
                break;
            }
            default:
            {
                System.out.println("The choice you made is invalid. Please try again.\n Thank You.");
            }
        }
        System.out.println("********************************************************************\n");
        System.out.println("******************Lester Hotel: We are your best dish trust.*************");
    }
}







