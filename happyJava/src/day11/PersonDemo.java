package day11;

import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {
        //Person을 여러명 저장하는 자료구조를 생각해보세요.

        Person person1 =
                new Person("123-111","kang","010-111-2222","강남구 역삼동");
        Person person2 =
                new Person("123-222","kim","010-111-3333","강남구 신사동");
        Person person3 =
                new Person("123-333","hong","010-111-5555","강남구 방배동");
        Person person4 =
                new Person("123-444","lee","010-111-3465","강남구 개포동");

        List<Person> personList = new ArrayList<>();
//        personList.add(null);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);


        Map<String, Person> personMap = new HashMap<>();
        personMap.put(person1.getIdNumber(), person1);
        personMap.put(person2.getIdNumber(),person2);
        personMap.put(person3.getIdNumber(), person3);
        personMap.put(person4.getIdNumber(),person4);


        //personList, personSet, personMap  에서 person의 idNumber를 에 해당하는 Person 객체를 찾고 싶어요.
        //코드를 생각해보세요.   idNumber가  123-333 해당하는 사람을 찾고 싶어요.

        Person findPerson = null;
        for(int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if(person !=null && "123-333".equals(person.getIdNumber())){
                findPerson = person;
                break;
            }
        }

        System.out.println(findPerson);

        for(Person person : personList){
            if(person !=null && "123-333".equals(person.getIdNumber())){
                findPerson = person;
                break;
            }
        }
        //set에서 원하는 값찾기
        for(Person person : personSet){
            if(person !=null && "123-333".equals(person.getIdNumber())){
                findPerson = person;
                break;
            }
        }

        //map 에서 찾기
        findPerson = personMap.get("123-333");



        //아래 Person 객체를 이용해서 찾는다면??
        Person fPserson = new Person("123-444","lee","010-111-3465","강남구 개포동");

        //list
        for(Person person:personList){
            if(fPserson.equals(person)){
                findPerson = person;
                break;
            }
        }

        System.out.println(findPerson);

        //set
        if(personSet.contains(findPerson)){
            findPerson = fPserson;
        }
        System.out.println(findPerson);
        //map
        findPerson = personMap.get(fPserson.getIdNumber());
        System.out.println(findPerson);

        System.out.println("정렬전 personList");
        System.out.println(personList);

        Collections.sort(personList);

        System.out.println("정렬후 personList");
        System.out.println(personList);


    }
}
