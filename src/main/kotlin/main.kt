fun main() {
    var scanInt = 0
    do{
        println("1) 12 oz Steak")
        println("2) Ravioli")
        println("3) Spaghetti and Meatballs")
        println("4) Water")
        println("5) Soft Drink")
        println("6) Exit")
        println("Enter Choice: ")
        scanInt = readln().toInt()
        if(scanInt==1) {
            println("12 oz Steak")
        }
        else if(scanInt==2) {
            println("Ravioli")
        }
        else if(scanInt==2) {
            println("Spaghetti and Meatballs")
        }
        else if(scanInt==4) {
            println("Water")
        }
        else if(scanInt==5) {
            println("Soft Drink")
        }
        else
            println("Not a choice")
    }while (scanInt!=6)
}