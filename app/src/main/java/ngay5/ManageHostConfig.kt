package ngay5

import java.lang.Exception
import java.util.*

class ManageHostConfig {
    private var listHostConfig = mutableListOf<HostConfig>()
    private lateinit var typeConnection: TypeConnection

    private fun addHostConfig(hostConfig: HostConfig){
        listHostConfig.add(hostConfig)
    }

    fun importHostConfig(){
        var n : Int = 0
        var flag = true

        while (flag){
            print("nhap vao so luong Host Config can tao (number >=4) : ")

            val str = readLine().toString()

            if(!str.matches("-?\\d+(\\.\\d+)?".toRegex())){
                println("vui long nhap number")
                continue
            }else if(str.toInt() < 4){
                println("vui long nhap so lon hon 4")
                continue
            }else{
                n = str.toInt()
                flag = false
                break
            }

        }

        for(i in 0 until n){
            println("Host Config : ${i + 1}")
            print("Ip : ")
            val ip = readLine().toString()
            print("Port : ")
            val port = readLine().toString().toInt()

            loop@ while(true){
                println("Lua chon Type Connection...")
                println("1. Wifi")
                println("2. Data 4G")
                println("3. Any")
                print("Type Connection (Wifi/Data 4G/Any) : ")

                val str = readLine().toString()
                if(!str.matches("-?\\d+(\\.\\d+)?".toRegex())){
                    println("vui long nhap 1 | 2 | 3")
                    continue
                }else if(str.toInt() !in 1..3){
                    println("vui long nhap 1 | 2 | 3")
                    continue
                }else{
                   when(str){
                       "1" -> {
                           typeConnection = TypeConnection.WIFI
                           break@loop
                       }
                       "2" -> {
                           typeConnection = TypeConnection.DATA_4G
                           break@loop
                       }
                       "3" -> {
                           typeConnection = TypeConnection.Any
                           break@loop
                       }
                   }
                }
            }



//            while (true){
//                print("Type Connection (Wifi/Data 4G/Any) : ")
//
//                when(readLine().toString().lowercase(Locale.getDefault())){
//                    "wifi" -> {
//                        typeConnection = TypeConnection.WIFI
//                        break
//                    }
//                    "data 4g" -> {
//                        typeConnection = TypeConnection.DATA_4G
//                        break
//                    }
//                    "any" -> {
//                        typeConnection = TypeConnection.Any
//                    }
//                    else -> continue
//                }
//            }
            addHostConfig(HostConfig(ip,port,typeConnection))
            addHostConfig(HostConfig(ip,port + 1,typeConnection))
            addHostConfig(HostConfig(ip,port + 2,typeConnection))
            addHostConfig(HostConfig(ip,port + 3,typeConnection))
        }
    }

    fun getAllHostConfig(){
        for(i in listHostConfig.indices){
            println(listHostConfig[i])
        }
    }

    fun getListOfHostConfigByIp(){
        println("nhap ip")
        val ip = readLine().toString()
        val listHostConfigByIp = mutableListOf<HostConfig>()
        for(i in listHostConfig.indices){
            if(listHostConfig[i].ip == ip){
                listHostConfigByIp.add(listHostConfig[i])
            }
        }
        if(listHostConfigByIp.isEmpty()){
            println("khong ton tai dia chi ip")
        }else{
            for(i in listHostConfigByIp.indices){
                println(listHostConfigByIp[i])
            }
        }
    }

    fun getListOfHostConfigByPort(){
        println("nhap port")
        val port = readLine()?.toInt()
        val listHostConfigByPort = mutableListOf<HostConfig>()
        for(i in listHostConfig.indices){
            if(listHostConfig[i].port == port){
                listHostConfigByPort.add(listHostConfig[i])
            }
        }
        if(listHostConfigByPort.isEmpty()){
            println("khong ton tai port nay")
        }else{
            for(i in listHostConfigByPort.indices){
                println(listHostConfigByPort[i])
            }
        }
    }

    fun getListOfConfigByTypeConnection(){
        val listHostConfigByTypeConnection = mutableListOf<HostConfig>()
        loop@ while(true){
            println("Lua chon Type Connection...")
            println("1. Wifi")
            println("2. Data 4G")
            println("3. Any")
            print("Type Connection (Wifi/Data 4G/Any) : ")

            val str = readLine().toString()
            if(!str.matches("-?\\d+(\\.\\d+)?".toRegex())){
                println("vui long nhap 1 | 2 | 3")
                continue
            }else if(str.toInt() !in 1..3){
                println("vui long nhap 1 | 2 | 3")
                continue
            }else{
                when(str){
                    "1" -> {
                        for(i in listHostConfig.indices){
                            if(listHostConfig[i].typeConnection == TypeConnection.WIFI){
                                listHostConfigByTypeConnection.add(listHostConfig[i])
                            }
                        }
                        if(listHostConfigByTypeConnection.isEmpty()){
                            println("khong co item nao!...")
                        }else{
                            for(i in listHostConfigByTypeConnection.indices){
                                println(listHostConfigByTypeConnection[i])
                            }
                        }
                        break@loop
                    }
                    "2" -> {
                        for(i in listHostConfig.indices){
                            if(listHostConfig[i].typeConnection == TypeConnection.DATA_4G){
                                listHostConfigByTypeConnection.add(listHostConfig[i])
                            }
                        }
                        if(listHostConfigByTypeConnection.isEmpty()){
                            println("khong co item nao!...")
                        }else{
                            for(i in listHostConfigByTypeConnection.indices){
                                println(listHostConfigByTypeConnection[i])
                            }
                        }
                        break@loop
                    }
                    "3" -> {
                        for(i in listHostConfig.indices){
                            if(listHostConfig[i].typeConnection == TypeConnection.Any){
                                listHostConfigByTypeConnection.add(listHostConfig[i])
                            }
                        }
                        if(listHostConfigByTypeConnection.isEmpty()){
                            println("khong co item nao!...")
                        }else{
                            for(i in listHostConfigByTypeConnection.indices){
                                println(listHostConfigByTypeConnection[i])
                            }
                        }
                        break@loop
                    }
                }
            }
        }
    }

    fun fakeData(){
        val ip1 = "192.168.1.8"
        val port1 = 20
        val typeConnection1 = TypeConnection.WIFI
        val ip2 = "192.168.1.9"
        val port2 = 30
        val typeConnection2 = TypeConnection.WIFI
        val ip3 = "192.168.1.10"
        val port3 = 40
        val typeConnection3 = TypeConnection.DATA_4G
        val ip4 = "192.168.1.11"
        val port4 = 50
        val typeConnection4 = TypeConnection.Any

        addHostConfig(HostConfig(ip1,port1,typeConnection1))
        addHostConfig(HostConfig(ip1,port1 + 1,typeConnection1))
        addHostConfig(HostConfig(ip1,port1 + 2,typeConnection1))
        addHostConfig(HostConfig(ip1,port1 + 3,typeConnection1))

        addHostConfig(HostConfig(ip2,port2,typeConnection2))
        addHostConfig(HostConfig(ip2,port2 + 1,typeConnection2))
        addHostConfig(HostConfig(ip2,port2 + 2,typeConnection2))
        addHostConfig(HostConfig(ip2,port2 + 3,typeConnection2))

        addHostConfig(HostConfig(ip3,port3,typeConnection3))
        addHostConfig(HostConfig(ip3,port3 + 1,typeConnection3))
        addHostConfig(HostConfig(ip3,port3 + 2,typeConnection3))
        addHostConfig(HostConfig(ip3,port3 + 3,typeConnection3))

        addHostConfig(HostConfig(ip4,port4,typeConnection4))
        addHostConfig(HostConfig(ip4,port4 + 1,typeConnection4))
        addHostConfig(HostConfig(ip4,port4 + 2,typeConnection4))
        addHostConfig(HostConfig(ip4,port4 + 3,typeConnection4))
    }

}