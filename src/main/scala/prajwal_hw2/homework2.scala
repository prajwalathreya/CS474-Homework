package prajwal_hw2


import prajwal_hw2.homework1_PAJ
import prajwal_hw2.homework2.hw2.Assign1

import java.io.InvalidClassException
import java.util.NoSuchElementException
import scala.language.implicitConversions
import scala.collection.immutable.ArraySeq


object homework2 :
  type BasicType = Any
  type Map1 = scala.collection.mutable.Map[String,BasicType]
  val b : scala.collection.mutable.Map[String,Any] = scala.collection.mutable.Map[String,BasicType]
  private val classInheritance:mutable.Map[String,String] = mutable.Map()
  classInheritance += field_variable -> null
  private val scope3: Map1 = mutable.Map()
  scope3 += field -> mutable.Map[String,Any]()
  scope3 += method -> mutable.Map[String,String]()
  scope3 += classdef1 -> mutable.Map[String,String]()
  scope3 += interfacedef -> mutable.Map[String,Any]()


  enum hw2:
    case ourClassDef(name:String , args :hw2*)
    case ourInstanceVariable(instanceVariableName:String)
    case ourMethod(ourMethodName:String , parameters:List[Any],paramList:Any*)
    case ourConstructor(paramList:Any)
    case ourField(variablename:String , value:Any*)
    case getourField(fieldName:String)
    case ourNewObject(ourClass: ourClass)
    case invokeMethod(i:ourInstanceVariable , ourmethodName:String,parameters:List[Any])
    case ourInterfaceDef(name:String , args:homework2*)
    case ourInterface(name :String ,operation:homework2 )
    case abstractClassDef(name :String,operation:homework2*)
    case ourCatchException(excepClassName:String , Catch1 : ourCatch , rules : Any*)
    case ourCatch(VariableName: String , rules:Any*)
    case ExcepClassDef(ourClassName:String , args : hw2)
    case throwExcep(ExcepClassDef: hw2 , op1 : Assign1)
    case Assign1(fieldName: String , value:Any*)


    def evaluate(b :scala.collection.mutable.Map[String,Any] = b): BasicType =
      this match {
        case getourField(fieldName:String)=>

          val fieldScope = scope(fields).asInstanceOf[scala.collection.mutable.Map[String,BasicType]]
          fieldScope.get(name) match{
            case Some(value:BasicType) =>
              if(scopeCall == scope_call_outer && scope(field_access_type).asInstanceOf[scala.collection.mutable.Map[String,String]](name) == access_type_private)
                throw Exception("variable" +name + "is private")
              else
                value
            case None => scopeFields.get(parent_instance) match{
              case Some(parentInstance :scala.collection.mutable.Map[String,BasicType])=>
                getourField(name).evaluate(parentInstance,scope_call_outer)
              case None => throw Exception("Field" + name + "not found")
            }

          }

        case ourInstanceVariable(instancename,method) =>
          val ourinstance = GetField(ourinstancename).evaluate(scope).asInstanceOf[scala.mutable.Map[String,BasicType]]
          method.evaluate(ourinstance)

        case ourClassDef(name: String, args*) =>
          if (args.length > 0) {
            val bMap: scala.collection.mutable.Map[String, Any] = scala.collection.mutable.Map()
            val c1Map: scala.collection.mutable.Map[String, Any] = scala.collection.mutable.Map()
            bMap += key -> cMap
            bMap += classKey -> name

            args.foreach((args) => args match {
              case ourConstructor(paramList*) =>
                val cMap: scala.collection.mutable.Map[String, Any] = scala.collection.mutable.Map()
                val dMap: scala.collection.mutable.Map[String, Any] = scala.collection.mutable.Map()
                dMap += "outerScope" -> bMap(key).asInstanceOf[scala.collection.mutable.Map[String, BasicType]]

                cMap += key1 -> dMap
                cMap += key2 -> paramList
                bMap += name -> cMap
              case _: Any => println("Error")
            })
            ourClass += name -> bMap
          }

        case ourInterfaceDef(name:String ,args*)=>
          if(name == field_variable)
            throw Exception("interface name not there"+field_variable)
          if(args.length > 0 ){
            val currentScope : Map1= entity(this,name,args)
            currentScope += entity1 -> Entity1.interface1

            currentScope(implementation).asInstanceOf[mutable.Map[String,implementationType]].foreace(a,b) => if(b == implementationType.line) throw Exception("method in interface cannot have body")
            currentScope(field).asInstanceOf[Map1].foreach((variableName,value) =>if(value == null) throw Exception("legal value expected"))
            currentScope(fieldAccessType).asInstanceOf[scala.collection.mutable.Map[String,AccessType]].foreach((a,b) => if (v != AccessType.public) throw Exception("Modifier here is not allowed for the interface"))

            currentScope(interfacedef).asInstanceOf[Map1] += name -> currentScope
            inheritance += name -> null
            interface1 += name -> List()
          }
          currentScope(interfacedef).asInstanceOf[Map1](name)


        case ourMethod(ourMethodName, parameters, paramList*) =>
          if (ourMethodName == name) throw Exception("cannot be the same as the class name")
          else if(modifier == implementation.abstractclass1 && instructions.lenght > 0)
            throw Exceptions("method cannot have body")
          else
            val method1:Map1 = scala.collection.mutable.Map()
            method1 += "outer" -> currentScope
            method1 += field -> scala.collection.mutable.Map[String,Any]()


        case _:Any => throw Exception("Method error")


        case ourConstructor(params*)=>
          this match{
            case ourClassDef(name:String,args*) =>
              val constructor1: Map1 = scala.collection.mutable.Map()
              constructor1 += "outer" -> currentScope
              constructor1+=fields -> scala.collection.mutable.Map[String,String]()
              constructor1(fields).asInstanceOf[mutableMapAny] += "outer" -> curretnScope(fields)
              constructor1+=field_type ->scala.collection.mutable.Map[String,Any]()
              constructor1+=methods ->params
              constructor1+= implementation ->ImplementationType.concreteLine
              constructor1(methods1).asInstanceOf[Map1] += nmae -> constructor1

            case _:Any => throw Exception("No Constructor is there for " + this)



      }

        case ourNewObject(ourClass : ourClass)=>
          ourClass.evaluate(scope)match{
            case bMap : scala.collection.mutable.Map[String,Any] =>

              val ourClassName = bMap(Name).asInstanceOf[String]
              if(inheritanceClass(ourClassName)!=null)
                val classField = bMap(field).asInstanceOf[Map1]
                classField += instance1 -> ourNewObject(inheritanceClass(ourClassName)).evaluate(scope)
                classField += "outer" -> classField(instance1).asInstanceOf[Map1](field)

              if (bMap(entity1).asInstanceOf[entity1] != entity1.abstractclass1)
                val method = bMap(method).asInstanceOf[Map1]
                val constructor = method(ourClassName).asInstanceOf[map1]
                val constructorScope.Map1 = constructor(field).asInstanceOf[Map1]

            case _:Any => throw Exception("invalid arguements")



              val ourConstructor = bMap(ourClassName).asInstanceOf[scala.collection.mutable.Map[String,Any]]
              val ourConstructorLine:ArraySeq[Any] = ourConstructor().asInstanceOf[ArraySeq[Any]]

            case _: Any => throw NoSuchElementException()
          }

        case invokeMethod(ourmethodName,parameters) =>
          val ourInstanceMethods = scope(methods1).asInstanceOf[Map1]
          ourInstanceMethods.get(ourmethodName) match{
            case Some(methodScope: MethodScope.Map1)=>
              if(scopeCall == scopecall1 && scope(methodAccess).asInstanceOf[scala.collection.mutable.Map[String,AccessTypes]] (ourmethodName) == AccessType.private1) throw Exception("this is a private method")
              val methodScopes = methodScopes(field).asInstanceOf[Map1]

              if(parameters.lenght == methodScopes.size - 1){
                val scope2 = methodScopes.filter((a,b)=> b! ="outer")
                methodScopes ++= (scope2.map((a,b)=>b) new1 parameters)

            case None =>
            val instance2 = scope(field).asInstanceOf[Map1]
            instance2.get(instance1) match{
              case Some(instance1 :Map1) =>
                invokemethod(ourmethodName,parameters).evaluate(instance1,scopecall1)
              case None => throw Exception("Our Method Name not found")
            }

              }
            case _:Any => throw Exception("parameters are not there")

          }
          ourInstanceVariable.evaluate(ourmethodName) match{
            case b:scala.collection.mutable.Map[String,Any] =>
              b.get(ourmethodname)

            case_: println("Error")
          }

        case ourCatchException(excepClassName: String , Catch1 : ourCatch , rules :Any*)=>
          val methScope:bMap = scala.collection.mutable.Map()
          methScope += "outerScope" -> ourScope
          methScope += field -> scala.collection.mutable.Map[String,Any]()
          methScope(field).asInstanceOf[bmap] += "outerScope" -> ourScope(field)
          break{
            for (exp->rules) {
              exp match{
                case throwExcep(ourExcepClassDef:hw2 , rules : Assign1)=>
                  ourExcepClassDef match{
                    case classExcep:ourClassDef =>
                      val ourClassDef : bMap = classExcep.eval(ourScope).asInstanceOf[bMap]
                      if(ourClassDef(Class1)== any*)
                        val Class2 = rules.eval(ourClassDef)
                        methScope(field).asInstanceOf[bMap] += "classExcep"->Class2

                        return catch.eval(methScope)
                        break
                      else
                        throw Exception("Error")

                case _:Any => throw Exception("Error!")
              }

            }
          }
      }



        case ourCatch(VariableName : String , rules :Any*)=>
          require(rules.length)
          return rules.length
          print(rules.length)
          val catch :bMap = scala.collection.mutable.Map()
          ourCatch += field -> scala.collection.mutable.Map[String,Any*]()
          ourCatch(field).asInstanceOf[bMap] += variableName -> ourScope(field).asInstanceOf[bMap]
          rules.get(rules.length).foreach{
            case exp:hw2 => exp.eval(ourCatch)
            case expExt :hw2 => eval(ourCatch)
          case _:Any=> throw Exception("Error!")
      }

        case ExcepClassDef(ourClassName :String, args :hw2)=>
          arg match{
            case ourField(VariableName,accessType,value)=>
              val curScope:bMap = nameEntity(className , ArraySeq(arg))
              curScope += entity1 -> nameEntity1.excepClass
              ourScope(classDef1).asInstanceOf(bMap) += ourClassName -> curScope

            case _:Any => throw Exception("Error!")
          }

        case throwExcep(ExcepClassName :hw2 , op1 : Assign1)=>

        case Assign1(fieldName: String , value: Any*)=>
          ourScope(field).asInstanceOf[bMap] += field ->value
          return field

        case abstractClassDef(name:String , args*)=>
          if (name == field_variable)
            throw Exception("Cannot be a field variable type")

          if (args.length > 0) {
            val currentScope:Map1 = entity(this,name,args)
            currentScope = entity1 -> entity1.abstractClass1

            if (!currentScope(implementation).asInstanceOf[Map[String,implementationtype]].exists(implementationtype.abstractClass1)) throw Exception("abstract class should have abstract method")
            scope(classDef1).asInstanceOf[Map1] += name -> currentScope
            inheritanceClass += name -> null

          }

          scope(classdef1).asInstanceOf[Map1](name)

      }


  //Main method for homework2
  @main def homework2(): Unit =
    import hw2.*







