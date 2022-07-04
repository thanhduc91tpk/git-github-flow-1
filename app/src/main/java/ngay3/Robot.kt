package ngay3

/*
* class Robot viet ra cach di chuyen cua 1 con robot
* */
class Robot(
    gridPosition: GridPosition = GridPosition(0, 0),
    orientation: Orientation = Orientation.NORTH
) {
    var gridPosition: GridPosition = gridPosition
        private set

    var orientation: Orientation = orientation
        private set

    fun turnRight() {
        this.orientation = when (orientation) {
            Orientation.NORTH -> Orientation.EAST
            Orientation.EAST -> Orientation.SOUTH
            Orientation.SOUTH -> Orientation.WEST
            Orientation.WEST -> Orientation.NORTH
        }
    }
    fun turnLeft() {
        orientation = when (orientation) {
            Orientation.NORTH -> Orientation.WEST
            Orientation.WEST -> Orientation.SOUTH
            Orientation.SOUTH -> Orientation.EAST
            Orientation.EAST -> Orientation.NORTH
        }
    }
    fun advance() {
        val x = gridPosition.x
        val y = gridPosition.y
        gridPosition = when (orientation) {
            Orientation.NORTH -> GridPosition(x, y + 1)
            Orientation.EAST -> GridPosition(x + 1, y)
            Orientation.SOUTH -> GridPosition(x, y - 1)
            Orientation.WEST -> GridPosition(x - 1, y)
        }
    }
    fun simulate(instructions: String) {
        instructions.forEach {
            when (it) {
                'L' -> turnLeft()
                'R' -> turnRight()
                'A' -> advance()
            }
        }
    }
}