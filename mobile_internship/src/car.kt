class car(make: String,model: String,val numberofdoors: Int):vehicle(make,model){

    override fun displayinfo() {
        super.displayinfo()
        println("the number of doors: $numberofdoors")

    }
}