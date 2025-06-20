package ru.dungeongg.kotlintask2.model

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
class Student {
    @XmlElement(name = "first_name")
    lateinit var firstName: String

    @XmlElement(name = "second_name")
    lateinit var secondName: String

    @XmlElement(name = "skills")
    lateinit var skills: Skills
}
