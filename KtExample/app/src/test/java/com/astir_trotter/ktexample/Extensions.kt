package com.astir_trotter.ktexample

import org.mockito.Mockito

/**
 * @author          - Saori Sugiyama
 * @contact         - sugiyama.saori.biz@gmail.com
 * @date            - 5/23/17
 */

inline fun <reified T : Any> mock(): T = Mockito.mock(T::class.java)