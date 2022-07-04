package ngay5

import java.util.*

fun main() {
    val manageHostConfig = ManageHostConfig()
//    manageHostConfig.fakeData()
    manageHostConfig.importHostConfig()
    do{
        menu()
        print("nhap lua chon : ")
        val str = readLine().toString()

        if(!str.matches("-?\\d+(\\.\\d+)?".toRegex())){
            println("vui long nhap vao la number")
            continue
        }else if(str.toInt() !in 1..5){
            println("khong co chuc nang nay!")
            continue
        }else{
            when(str){
                "1" -> {
                    manageHostConfig.getAllHostConfig()
                    continue
                }
                "2" -> {
                    manageHostConfig.getListOfHostConfigByIp()
                    continue
                }
                "3" -> {
                    manageHostConfig.getListOfHostConfigByPort()
                    continue
                }
                "4" -> {
                    manageHostConfig.getListOfConfigByTypeConnection()
                    continue
                }
                "5" -> {
                    println("finish!...")
                    break
                }
            }
        }
    }while (true)
}

fun menu(){
    println("------------ Menu ------------")
    println("1. in ra tat ca danh sach HostConfig")
    println("2. in ra tat ca danh sach HostConfig theo Ip")
    println("3. in ra tat ca danh sach HostConfig theo Port")
    println("4. in ra tat ca danh sach HostConfig theo Type Connection ")
    println("5. thoat ")

}