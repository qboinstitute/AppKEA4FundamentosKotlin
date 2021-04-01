class Profesor : IProfesor {
    override fun dictaClase() {
        var listaAlumnos = ArrayList<Alumno>()
        listaAlumnos.add(
            Alumno("Emir",
                "Saldaña",
                27,
                "esaldaña@qboinstitute.com")
        )
        listaAlumnos.add(Alumno("Luis",
            "Sarmiento",
            28,
            "lsarmiento@qboinstitute.com"))
        listaAlumnos.add(Alumno("Michael",
            "Flores",
            25,
            "mflores@qboinstitute.com"))
        listaAlumnos.add(Alumno("J",
            "Palacios",
            39,
            "jpalacios@qboinstitute.com"))
    }

    override fun registraAsistencia(nomAlumno: String, asistencia: Boolean) {

    }

    override fun registrarNota(nomAlumno: String, nota: Int) {

    }
}