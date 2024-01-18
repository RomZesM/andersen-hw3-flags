package com.example.flags.extensions

class Flags(var title: String, var adress: String) {

    companion object{
       var flagsArr : ArrayList<Flags> = arrayListOf<Flags>()

        init {
            flagsArr.add(Flags("Austria", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Austria.svg/2560px-Flag_of_Austria.svg.png"))
           flagsArr.add(Flags("Poland", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Flag_of_Poland.svg/2560px-Flag_of_Poland.svg.png"))
           flagsArr.add(Flags("Italy",    "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Flag_of_Italy.svg/2560px-Flag_of_Italy.svg.png"))
           flagsArr.add(Flags("Colombia", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/2560px-Flag_of_Colombia.svg.png"))
           flagsArr.add(Flags("Madagascar", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Madagascar.svg/2560px-Flag_of_Madagascar.svg.png"))
           flagsArr.add(Flags("Thailand","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_Thailand.svg/2560px-Flag_of_Thailand.svg.png"))
           flagsArr.add(Flags("Denmark", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Denmark.svg/1920px-Flag_of_Denmark.svg.png"))
           flagsArr.add(Flags("Switzerland","https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Switzerland_%28Pantone%29.svg/1920px-Flag_of_Switzerland_%28Pantone%29.svg.png"))
       }


    }
}