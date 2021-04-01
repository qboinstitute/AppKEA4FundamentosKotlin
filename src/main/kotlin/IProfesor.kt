interface IProfesor {
    //Las interfaces nos van a definir acciones que se pueden
    //implementar a las clases.
    fun dictaClase()
    fun registraAsistencia(nomAlumno: String, asistencia : Boolean)
    fun registrarNota(nomAlumno: String, nota: Int)
}