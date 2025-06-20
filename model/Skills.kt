package ru.dungeongg.kotlintask2.model

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
class Skills {
    @XmlElement(name = "skill")
    var skillList: List<Skill> = mutableListOf()
}
