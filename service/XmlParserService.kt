package ru.dungeongg.kotlintask2.service

import ru.dungeongg.kotlintask2.model.Students
import java.io.StringReader
import javax.xml.bind.JAXBContext

class XmlParserService {

    fun parseStudents(xml: String): List<ru.dungeongg.kotlintask2.model.Student> {
        val jaxbContext = JAXBContext.newInstance(Students::class.java)
        val unmarshaller = jaxbContext.createUnmarshaller()
        val students = unmarshaller.unmarshal(StringReader(xml)) as Students
        return students.studentList
    }
}
