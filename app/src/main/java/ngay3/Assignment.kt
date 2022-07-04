package ngay3

fun main() {
    val robot = Robot(gridPosition = GridPosition(7,3), orientation = Orientation.NORTH)
    robot.simulate("RAALAL")
    println("toa do hien tai : x -> ${robot.gridPosition.x} , y -> ${robot.gridPosition.y} , facing ${robot.orientation.name} ")

}
