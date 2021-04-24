package io.github.ermadmi78.kobby.cinema.api.kobby.kotlin

import io.github.ermadmi78.kobby.cinema.api.kobby.kotlin.entity.*

/**
 * Created on 13.03.2021
 *
 * @author Dmitry Ermakov (ermadmi78@gmail.com)
 */

suspend fun CinemaContext.findCountry(id: Long, __projection: CountryProjection.() -> Unit = {}): Country? =
    query {
        country(id, __projection)
    }.country

suspend fun CinemaContext.fetchCountry(id: Long, __projection: CountryProjection.() -> Unit = {}): Country =
    findCountry(id, __projection)!!

//**********************************************************************************************************************

suspend fun CinemaContext.findFilm(id: Long, __projection: FilmProjection.() -> Unit = {}): Film? =
    query {
        film(id, __projection)
    }.film

suspend fun CinemaContext.fetchFilm(id: Long, __projection: FilmProjection.() -> Unit = {}): Film =
    findFilm(id, __projection)!!

//**********************************************************************************************************************

suspend fun CinemaContext.findActor(id: Long, __projection: ActorProjection.() -> Unit = {}): Actor? =
    query {
        actor(id, __projection)
    }.actor

suspend fun CinemaContext.fetchActor(id: Long, __projection: ActorProjection.() -> Unit = {}): Actor =
    findActor(id, __projection)!!