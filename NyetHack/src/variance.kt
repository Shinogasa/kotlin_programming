import com.bignerdranch.nyethack.Coin
import com.bignerdranch.nyethack.Fedora
import com.bignerdranch.nyethack.Loot

class Barrel<in T>(item: T)

fun main(args: Array<String>) {
    var fedoraBarrel: Barrel<Fedora> =
        Barrel(Fedora("a generic-looking fedora", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))

    fedoraBarrel = lootBarrel
}