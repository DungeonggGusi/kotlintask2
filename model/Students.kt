package ru.dungeongg.kotlintask2.model

import javax.xml.bind.annotation.*

@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
class Students {
    @XmlElement(name = "student")
    var studentList: List<Student> = mutableListOf()
}
