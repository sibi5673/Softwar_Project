import React from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Home from './pages/Shared/Home'
import Login from './pages/Shared/Login'
import UserLayout from './layout/UserLayout'
import AdminLayout from './layout/AdminLayout'
import AdminDashboard from './pages/Admin/AdminDashboard'
import NotFound from './pages/Shared/NotFound'
import HomeLayout from './layout/HomeLayout'
import AdminUser from './pages/Admin/AdminUser'
import UserDashboard from './pages/User/UserDashboard'
import UserWorkout from './pages/User/UserWorkout'
import UserSubscription from './pages/User/UserSubscription'
import UserSettings from './pages/User/UserSettings'
import AdminTrainers from './pages/Admin/AdminTrainers'
import '@/assets/css/Shadow.css'

const App = () => {

    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route element={<HomeLayout />}>
                        <Route path='/' element={<Home />} />
                        <Route path='/login' element={<Login />} />
                    </Route>

                    <Route element={<UserLayout />}>
                        <Route path='/dashboard' element={<UserDashboard/>} />
                        <Route path='/workout' element={<UserWorkout/>} />
                        <Route path='/payment' element={<UserSubscription/>} />
                        <Route path='/settings' element={<UserSettings/>} />
                    </Route>
                    
                    <Route element={<AdminLayout />}>
                        <Route path='/admin/dashboard' element={<AdminDashboard />} />
                        <Route path='/admin/users' element={<AdminUser/>} />
                        <Route path='/admin/trainers' element={<AdminTrainers/>} />
                    </Route>

                    <Route path='*' element={<NotFound />} />
                </Routes>
            </BrowserRouter>


        </>
    )
}

export default App