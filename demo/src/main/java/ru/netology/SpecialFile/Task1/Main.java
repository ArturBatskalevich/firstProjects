//package ru.netology.SpecialFile.Task1;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
//import com.opencsv.*;
//import com.opencsv.bean.ColumnPositionMappingStrategy;
//import com.opencsv.bean.CsvToBean;
//import com.opencsv.bean.CsvToBeanBuilder;
//import org.json.simple.JSONArray;
//import org.w3c.dom.*;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerFactory;
//import javax.xml.transform.dom.DOMSource;
//import javax.xml.transform.stream.StreamResult;
//import java.io.*;
//import java.lang.reflect.Type;
//import java.util.HashMap;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        String[] employee1 = "1,John,Smith,USA,25".split(",");
//        String[] employee2 = "2,Inav,Petrov,RU,23".split(",");
//
//        try (CSVWriter writer = new CSVWriter(new FileWriter("data.csv"))) {
//
//            writer.writeNext(employee1);
//            writer.writeNext(employee2);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
//        String fileName = "data.csv";
//
//        List<Employee> list = parseCSV(columnMapping, fileName);
//
//        System.out.println(list);
//
//        String json = listToJson(list);
//
//        writeString(json);
//
//        try {
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.newDocument();
//
//            Element staff = document.createElement("staff");
//            document.appendChild(staff);
//
//            Element employee = document.createElement("employee");
//
//            employee.setAttribute("id", "1");
//            employee.setAttribute("firstname", "John");
//            employee.setAttribute("lastname", "Smith");
//            employee.setAttribute("country", "USA");
//            employee.setAttribute("age", "25");
//            staff.appendChild(employee);
//            Element employee3 = document.createElement("employee");
//            employee3.setAttribute("id", "2");
//            employee3.setAttribute("firstname", "Ivan");
//            employee3.setAttribute("lastname", "Petrov");
//            employee3.setAttribute("country", "RU");
//            employee3.setAttribute("age", "23");
//            staff.appendChild(employee3);
//
//            DOMSource domSource = new DOMSource(document);
//            StreamResult streamResult = new StreamResult(new File("data.xml"));
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer transformer = transformerFactory.newTransformer();
//            transformer.transform(domSource,streamResult);
//
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        List<Employee> list1 = parseXML("data.xml");
//
//        System.out.println(list1);
//
//    }
//
//    public static List<Employee> parseCSV(String[] columnMapping, String file) {
//
//        List<Employee> result = null;
//
//        try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
//
//            ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
//            strategy.setType(Employee.class);
//            strategy.setColumnMapping(columnMapping);
//
//            CsvToBean<Employee> csv = new CsvToBeanBuilder<Employee>(csvReader)
//                    .withMappingStrategy(strategy)
//                    .build();
//
//            result = csv.parse();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }
//
//    public static String listToJson(List<Employee> list) {
//
//        Type listType = new TypeToken<List<Employee>>() {
//        }.getType();
//
//        GsonBuilder builder = new GsonBuilder();
//        Gson gson = builder.create();
//
//        String json = gson.toJson(list, listType);
//
//        return json;
//    }
//
//    public static void writeString(String json) {
//
//        JSONArray array = new JSONArray();
//        array.add(json);
//
//        try (FileWriter file = new FileWriter("data.json")) {
//            file.write(array.toJSONString());
//            file.flush();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static List<Employee> parseXML(String file) {
//
//        List<Employee> listXML = null;
//        HashMap<String,String> hm = new HashMap<>();
//
//        try {
//                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//                DocumentBuilder builder = factory.newDocumentBuilder();
//                Document doc = builder.parse(new File(file));
//
//                Node staff = doc.getDocumentElement();
//                NodeList nodeList = staff.getChildNodes();
//
//                for (int i = 0; i < nodeList.getLength(); i++) {
//                    Node node = nodeList.item(i);
//                    Element employee = (Element) node;
//                    NamedNodeMap map = employee.getAttributes();
//
//                    for (int a = 0; a < map.getLength(); a++) {
//                        String attrName = map.item(a).getNodeName();
//                        String attrValue = map.item(a).getNodeValue();
//                        hm.put(attrName,attrValue);
//                        System.out.println("Атрибут: " + attrName + "; значение: " + attrValue);
//
//
//                    }
//                    listXML.add(new Employee(Integer.parseInt(hm.get("id")),hm.get("firstname"),
//                            hm.get("lastname"),hm.get("country"),Integer.parseInt(hm.get("age"))));
//
//
//                }
//
//
//            }catch(Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        return listXML;
//    }
//}
