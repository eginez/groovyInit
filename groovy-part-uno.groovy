//Typical java statement
System.out.println("Hello zillow");


//First thing groovy autoimports a lot of the stand java library
println("Hello zillow");


//No parethensis, no semi colon
print "Hi Zillow."
println "Bye Zillow"


//Variables
//FUlly typed
String myString = "Hi Zillow"
printn myString

//Dynamic type
def myOtherString = "Bye Zillow"
println myOtherString

//String interpolation
def name='Esteban'
print 'Hello' + name
print "Hello $name"
print "Hello ${name.toUpperCase()}"


//Auto getter setters
class Neat {
     String prop
}

Neat n = new Neat()
n.prop = 'Hi there' //n.setProp('Hi there')
println n.prop     //println n.getProp()
//Or you can provide your own getters and setters

//Closures
Closure s = { n -> Math.pow(2, n) }
def s2 = {int n -> Math.pow(10,n) }


//Scoping in closure
String out = 'Esteban'
def c = {
    println out
}
c()


//weird closure syntax
void runCls (int n, Closure closure) {
        println closure n
}

runCls 2, {it-> Math.pow(2,it) }

//You can put a closure outside the parenthesis :/
runCls(2) {it->Math.pow(10,it)}


//List
def l = [1,2,3]
l.each { println it }


//Map
def m = [a:1, b:2, c:3]
assert m.a == m['a']


//Maps as arguments
void withMaps(Map conf) {
    println conf
}

withMaps([a:1, b:2])
withMaps(a:1, b:2)




