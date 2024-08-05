import javax.print.attribute.standard.MediaSize.Other

class complexnumber(val real:Int,val imaginary:Int){
    operator fun plus(x: complexnumber):complexnumber{
        return complexnumber(real+x.real,imaginary+x.imaginary  )


    }

    override fun toString(): String {
        return "${real}r + ${imaginary}i"
    }


}